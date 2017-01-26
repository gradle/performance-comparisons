package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_77 {
    private final Production49_77 production = new Production49_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}