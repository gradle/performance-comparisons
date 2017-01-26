package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_393 {
    private final Production11_393 production = new Production11_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}