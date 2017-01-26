package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_76 {
    private final Production90_76 production = new Production90_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}