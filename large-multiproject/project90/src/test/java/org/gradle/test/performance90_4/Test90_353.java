package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_353 {
    private final Production90_353 production = new Production90_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}