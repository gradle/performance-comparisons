package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_425 {
    private final Production44_425 production = new Production44_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}