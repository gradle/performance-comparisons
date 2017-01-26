package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_267 {
    private final Production68_267 production = new Production68_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}