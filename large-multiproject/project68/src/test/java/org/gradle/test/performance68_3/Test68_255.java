package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_255 {
    private final Production68_255 production = new Production68_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}