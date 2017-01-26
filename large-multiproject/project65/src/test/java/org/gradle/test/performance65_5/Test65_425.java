package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_425 {
    private final Production65_425 production = new Production65_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}