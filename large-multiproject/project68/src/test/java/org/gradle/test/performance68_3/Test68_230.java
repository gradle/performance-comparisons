package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_230 {
    private final Production68_230 production = new Production68_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}