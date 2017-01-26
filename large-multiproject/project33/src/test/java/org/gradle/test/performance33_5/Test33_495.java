package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_495 {
    private final Production33_495 production = new Production33_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}