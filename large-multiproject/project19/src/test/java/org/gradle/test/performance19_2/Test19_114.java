package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_114 {
    private final Production19_114 production = new Production19_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}