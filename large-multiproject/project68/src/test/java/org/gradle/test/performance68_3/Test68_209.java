package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_209 {
    private final Production68_209 production = new Production68_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}