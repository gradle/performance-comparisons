package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_45 {
    private final Production90_45 production = new Production90_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}