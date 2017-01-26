package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_87 {
    private final Production19_87 production = new Production19_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}