package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_25 {
    private final Production34_25 production = new Production34_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}