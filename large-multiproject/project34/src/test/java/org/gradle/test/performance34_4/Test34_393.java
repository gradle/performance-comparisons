package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_393 {
    private final Production34_393 production = new Production34_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}