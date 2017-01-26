package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_393 {
    private final Production52_393 production = new Production52_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}