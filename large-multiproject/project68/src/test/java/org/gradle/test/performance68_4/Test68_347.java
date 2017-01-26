package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_347 {
    private final Production68_347 production = new Production68_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}