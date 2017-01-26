package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_498 {
    private final Production11_498 production = new Production11_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}