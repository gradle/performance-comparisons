package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_425 {
    private final Production73_425 production = new Production73_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}