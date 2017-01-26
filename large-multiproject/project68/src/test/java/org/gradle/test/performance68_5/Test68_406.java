package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_406 {
    private final Production68_406 production = new Production68_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}