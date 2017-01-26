package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_406 {
    private final Production90_406 production = new Production90_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}