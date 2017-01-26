package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_126 {
    private final Production68_126 production = new Production68_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}