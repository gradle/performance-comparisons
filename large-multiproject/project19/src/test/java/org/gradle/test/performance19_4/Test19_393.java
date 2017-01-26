package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_393 {
    private final Production19_393 production = new Production19_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}