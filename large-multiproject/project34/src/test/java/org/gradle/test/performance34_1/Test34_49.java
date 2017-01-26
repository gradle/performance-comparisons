package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_49 {
    private final Production34_49 production = new Production34_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}