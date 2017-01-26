package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_77 {
    private final Production43_77 production = new Production43_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}