package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_444 {
    private final Production33_444 production = new Production33_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}