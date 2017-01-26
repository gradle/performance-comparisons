package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_71 {
    private final Production49_71 production = new Production49_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}