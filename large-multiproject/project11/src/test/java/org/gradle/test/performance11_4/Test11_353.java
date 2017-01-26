package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_353 {
    private final Production11_353 production = new Production11_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}