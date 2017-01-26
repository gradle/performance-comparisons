package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_500 {
    private final Production68_500 production = new Production68_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}