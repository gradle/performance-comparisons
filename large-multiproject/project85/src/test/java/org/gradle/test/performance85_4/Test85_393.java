package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_393 {
    private final Production85_393 production = new Production85_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}