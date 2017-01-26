package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_425 {
    private final Production43_425 production = new Production43_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}