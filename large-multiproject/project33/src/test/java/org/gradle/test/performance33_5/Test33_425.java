package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_425 {
    private final Production33_425 production = new Production33_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}