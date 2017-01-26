package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_388 {
    private final Production68_388 production = new Production68_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}