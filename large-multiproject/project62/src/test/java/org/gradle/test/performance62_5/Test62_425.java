package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_425 {
    private final Production62_425 production = new Production62_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}