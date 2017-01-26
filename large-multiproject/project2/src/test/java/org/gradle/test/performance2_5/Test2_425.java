package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_425 {
    private final Production2_425 production = new Production2_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}