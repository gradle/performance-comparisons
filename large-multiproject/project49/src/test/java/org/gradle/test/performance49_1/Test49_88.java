package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_88 {
    private final Production49_88 production = new Production49_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}