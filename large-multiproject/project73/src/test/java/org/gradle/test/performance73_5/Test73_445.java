package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_445 {
    private final Production73_445 production = new Production73_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}