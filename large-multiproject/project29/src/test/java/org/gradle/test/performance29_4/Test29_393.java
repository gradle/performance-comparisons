package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_393 {
    private final Production29_393 production = new Production29_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}