package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_425 {
    private final Production23_425 production = new Production23_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}