package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_393 {
    private final Production51_393 production = new Production51_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}