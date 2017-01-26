package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_325 {
    private final Production68_325 production = new Production68_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}