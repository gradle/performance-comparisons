package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_425 {
    private final Production45_425 production = new Production45_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}