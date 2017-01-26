package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_393 {
    private final Production68_393 production = new Production68_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}