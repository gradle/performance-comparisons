package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_38 {
    private final Production34_38 production = new Production34_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}