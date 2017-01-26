package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_425 {
    private final Production59_425 production = new Production59_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}