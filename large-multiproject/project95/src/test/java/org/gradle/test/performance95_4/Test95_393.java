package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_393 {
    private final Production95_393 production = new Production95_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}