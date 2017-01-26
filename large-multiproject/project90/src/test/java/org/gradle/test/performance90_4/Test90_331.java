package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_331 {
    private final Production90_331 production = new Production90_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}