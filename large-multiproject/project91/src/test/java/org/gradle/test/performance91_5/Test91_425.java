package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_425 {
    private final Production91_425 production = new Production91_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}