package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_393 {
    private final Production72_393 production = new Production72_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}