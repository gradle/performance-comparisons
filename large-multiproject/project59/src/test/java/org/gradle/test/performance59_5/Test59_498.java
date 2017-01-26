package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_498 {
    private final Production59_498 production = new Production59_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}