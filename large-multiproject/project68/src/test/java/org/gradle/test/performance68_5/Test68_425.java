package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_425 {
    private final Production68_425 production = new Production68_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}