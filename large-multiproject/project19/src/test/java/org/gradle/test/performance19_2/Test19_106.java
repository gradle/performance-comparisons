package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_106 {
    private final Production19_106 production = new Production19_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}