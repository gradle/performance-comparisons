package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_425 {
    private final Production9_425 production = new Production9_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}