package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_77 {
    private final Production73_77 production = new Production73_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}