package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_61 {
    private final Production68_61 production = new Production68_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}