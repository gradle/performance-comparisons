package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_353 {
    private final Production99_353 production = new Production99_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}