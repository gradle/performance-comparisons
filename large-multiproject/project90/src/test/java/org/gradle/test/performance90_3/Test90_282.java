package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_282 {
    private final Production90_282 production = new Production90_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}